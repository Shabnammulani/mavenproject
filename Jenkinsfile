pipeline {
    agent any

    stages {
        stage('Build Utility') {
            steps {
                dir('ImpUtilityClass') {
                    git branch: 'master', url: 'https://github.com/Shabnammulani/ImpUtilityClass.git'
                    bat 'mvn clean install'
                }
            }
        }

        stage('Build Main Project') {
            steps {
                dir('MavenProject') {
                    git branch: 'master', url: 'https://github.com/Shabnammulani/mavenproject.git'
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                dir('MavenProject') {
                    bat 'mvn test'
                }
            }
        }
    }
}
