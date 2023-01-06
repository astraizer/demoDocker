pipeline{
	agent any;
    	tools 
		maven 'apache-maven-3.0.1' 
    	}
	stages{
		stage("build"){
			steps{
			 sh """
                    		export JAVA_HOME=/usr/lib/jvm/java-1.8.0
                    		mvn clean package -DskipTests=true
                    		"""
			}
		}
	}

}
