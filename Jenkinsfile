pipeline{
    agent any
    tools {
        maven "maven"
    }
    stages{
        stage("SCM checkout"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ssagarwala/jenkins-ci-cd.git']])
            }
        }
        stage("Build Process"){
            steps{
                script{
                    bat  'mvn clean install'
                }
            }
        }
        stage("Deploy to Container"){
            steps{
            deploy adapters: [tomcat9(credentialsId: 'tomcat-pwd', path: '', url: 'http://localhost:8080/')], contextPath: 'jenkinsCiCd', war: '**/*.war'
            }
        }
    }
}

// angent any means it could be container or local machine
// tools being used make sure the maven name is same as used in  Dashboard-> tools-> scroll very down to seee the Maven used by
// jenkins

// stages we need to add for now.   
// poll SCM 
// build the source
//deploy the war
// EMail 

