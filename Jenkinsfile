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
				script{
					withCredentials([sshUserPrivateKey(credentialsId: 'ocp', keyFileVariable: 'sshKey', passphraseVariable: 'pass', usernameVariable: 'ocp')]) {
						def remote = [:]
						remote.name='test'
						remote.host='168.138.214.199'
						remote.user='ocp'
						remote.identityFile='sshKey'
						remote.allowAnyHosts=true
						sshCommand remote: remote, command: "ls -lrt"
						sshCommand remote: remote, command: "for i in {1..5}; do echo -n \"Loop \$i \"; date ; sleep 1; done"
					}
				}
			}
		}
		
	}

}
