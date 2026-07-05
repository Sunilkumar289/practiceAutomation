pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test -Dexecution=remote'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
