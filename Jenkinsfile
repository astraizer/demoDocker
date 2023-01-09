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
				}
			}
		}
		stage("deploy"){
			steps{
				script{
					sh 'docker compose up --build'
				}
			}
		}
	}

}
