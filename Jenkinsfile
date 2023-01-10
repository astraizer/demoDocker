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
					sh 'ls -la'
				}
			}
		}
// 		stage("deploy"){
// 			steps{
// 				script{
// 					sshagent(credentials:['opc']){
// 						sh """
// 						ssh opc@168.138.214.199 rm -rf /var/www/temp_deploy/dist/
// 						ssh opc@168.138.214.199 mkdir -p /var/www/temp_deploy
// 						scp -r dist opc@168.138.214.199:/var/www/temp_deploy/dist/
// 						ssh user@server “rm -rf /var/www/example.com/dist/ && mv /var/www/temp_deploy/dist/ /var/www/example.com/”
// 						"""
// 					}
// 				}
// 			}
// 		}
		
	}

}
