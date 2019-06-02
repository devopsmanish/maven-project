pipeline {
    agent any
    tools {
        jdk 'jdk'
        maven 'maven 3.3'
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