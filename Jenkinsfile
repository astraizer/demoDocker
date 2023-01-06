pipeline{
	agent any;
    	tools {
        	maven 'Maven 3.8.6'
       		jdk 'Java 17.0.4.1'
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
