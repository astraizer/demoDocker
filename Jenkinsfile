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
					sshagent(credentials:['opc']){
						sh 'ssh  opc@168.138.214.199 uptime "whoami"'
					}
				}
			}
		}
		
	}

}
