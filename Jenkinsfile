pipeline {
    agent any

    stages {
      stage('Checkout') {
            steps {
                checkout scm
            }
        }
        parallel{
        
         stage('Build & Test') {
            steps {
                sh 'mvn clean test -Dexecution=remote'
            }
        }
        stage('print log') {
            steps {
                sh '''
                   echo 'hello world'
                   '''
            }
        }
    }
     
       
    }

    post {
        always {
            cleanWs()
        }
    }
}
