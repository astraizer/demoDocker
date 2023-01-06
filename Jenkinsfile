pipeline{
	agent any;
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
