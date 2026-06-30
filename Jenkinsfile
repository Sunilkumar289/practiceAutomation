pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                // Runs Maven directly
                sh 'mvn clean test'
            }
        }
    }
}