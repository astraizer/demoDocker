pipeline {
	agent any;
	tools {
		maven 'maven 3.8.7' 
    	}
	stages{
		stage("build"){
			steps {
				sh 'java --version'
		                sh """
                    		mvn clean package -DskipTests=true
                    		"""
			}
		}
	}

}
