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
                //artficat
                //junit check style
                // build other project


            }
            post {
                success {
                    // Archive the artifacts
                    archiveArtifacts '**/*.war'

                    // checkstye report
                    junit '**/surefire-reports/*.xml'

                    // deploy
                    build 'deploy'
                }
            }
        }
        stage('deploy') {
            steps {
                echo "Deploy stage"

            }
        }

    }
}