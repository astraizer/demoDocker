pipeline {
	agent any;
 	tools {
 		maven 'maven 3.8.7' 
     	}
	stages{
		/*stage("build"){
			steps {
				script{
		                	sh 'mvn clean package -DskipTests=true'
				}
			}
		}*/
		stage("deploy"){
			steps{
				withCredentials([sshUserPrivateKey(credentialsId: 'ocp', keyFileVariable: 'keyFile', passphraseVariable: 'pass', usernameVariable: 'ocp')]) {
					def remote = [name:'homeTest',host:'168.138.214.199',user:'ocp',identityFile:keyFile,allowAnyHosts:true]
					sshCommand remote: remote, command: "ls -lrt"
					sshCommand remote: remote, command: "for i in {1..5}; do echo -n \"Loop \$i \"; date ; sleep 1; done"
				}

			}
		}
	}

}
