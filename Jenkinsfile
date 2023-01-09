pipeline {
	agent any;
	stages{
		stage("build"){
			steps {"
				sh 'docker compose up --build'
		                sh """
                    		mvn clean package -DskipTests=true
                    		""
			}
		}
	}

}
