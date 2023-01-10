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
						sh ' opc@168.138.214.199 pwd'
						sh ' opc@168.138.214.199 ls -la'
// 						sh """
// 						ssh opc@168.138.214.199 rm -rf ./
// 						ssh opc@168.138.214.199 mkdir -p /
// 						scp -r target/demo-0.0.1-SNAPSHOT.jar opc@168.138.214.199:/home/ocp/java
// 						ssh opc@168.138.214.199 java -jar -server demo-0.0.1-SNAPSHOT.jar
// 						"""
					}
				}
			}
		}
		
	}

}
