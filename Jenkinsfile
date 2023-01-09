pipeline {
	agent any;
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
