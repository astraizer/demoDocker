pipeline {
	agent any;
 	tools {
 		maven 'maven 3.8.7' 
     	}
	stages{
		stage("build"){
			steps {
				script{
		                	sh 'mvn clean package -DskipTests=true'
					sh 'ls -la'
				}
			}
		}
		stage("deploy"){
			steps{
				script{
					sshagent(credentials:['opc']){
						sh """
						ssh opc@168.138.214.199 rm -rf /home/ocp/java
						ssh opc@168.138.214.199 mkdir -p /home/ocp/java
						scp -r target/demo-0.0.1-SNAPSHOT.jar opc@168.138.214.199:/home/ocp/java
						ssh opc@168.138.214.199 java -jar -server demo-0.0.1-SNAPSHOT.jar
						"""
					}
				}
			}
		}
		
	}

}
