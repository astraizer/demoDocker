pipeline {
	agent any;
 	tools {
 		maven 'maven 3.8.7' 
     	}
	stages{
		/*stage("build"){
			steps {
				script{
		                	sh 'mvn clean package -DskipTests=true'
				}
			}
		}*/
		stage("deploy"){
			steps{
				script{
					sshagent(credentials:['Login_Cloud_Server']){
						sh 'ssh  -o StrictHostKeyChecking=no  root@135.181.203.3 uptime "whoami"'
					}
				}
			}
		}
		
	}

}
