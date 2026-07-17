pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Parallel Tasks') {
            parallel {
                stage('Build & Test') {
                    steps {
                        sh 'mvn clean test -Dexecution=remote'
                    }
                }
                stage('Print Log') {
                    steps {
                        sh '''
                           echo "hello world"
                           '''
                    }
                }
            }
        }
    }
}
