pipeline {
    agent any
    tools {
        jkd 'java8'
        maven 'maven3'
    }
    stages {
        stage('init') {
            steps {
                echo "Init stage"
                sh label: '', script: 'mvn clean package checkstyle:checkstyle'
            }
        }
        stage('build') {
            steps {
                echo "Buid stage"

            }
        }
        stage('deploy') {
            steps {
                echo "Deploy stage"

            }
        }

    }
}