pipeline {
	agent any;
	tools {
	        docker 'latest'
		maven 'maven 3.8.7' 
    	}
	stages{
		stage("build"){
			steps {
		                sh """
                    		mvn clean package -DskipTests=true
                    		"""
				sh 'docker compose up --build'
			}
		}
	}

}
