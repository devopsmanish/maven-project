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
            }
        }
        stage('build') {
            steps {
                echo "Buid stage"
                sh label: '', script: 'mvn clean package checkstyle:checkstyle'
            }
            post {
                success {
                    // Archive the artifacts
                    archiveArtifacts '**/*.war'

                    // checkstye report
                    checkstyle canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '', unHealthy: ''

                   /// test analysis result
                    junit '**/surefire-reports/*.xml'
                }
            }
        }
        stage('deploy') {
            steps {
                echo "Deploy stage"
                timeout(time: 60, unit: 'SECONDS') {
                    input 'Do you want to deploy your code'
                }
                // deploy
                build 'deploy'
            }
        }

    }
}