pipeline {
    agent any

    stages {
        stage('Checkout Utility') {
            steps {
                dir('ImpUtilityClass') {
                    git branch: 'master', url: 'https://github.com/Shabnammulani/ImpUtilityClass.git'
                }
            }
        }

        stage('Build Utility') {
            steps {
                dir('ImpUtilityClass') {
                    echo 'Building Utility Project...'
                    bat 'mvn clean install'
                }
            }
        }

        stage('Checkout Main Project') {
            steps {
                dir('MavenProject') {
                    git branch: 'master', url: 'https://github.com/Shabnammulani/mavenproject.git'
                }
            }
        }

        stage('Build Main Project') {
            steps {
                dir('MavenProject') {
                    echo 'Building Main Project...'
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test Main Project') {
            steps {
                dir('MavenProject') {
                    echo 'Running Tests...'
                    bat 'mvn test'
                }
            }
        }
    }
}
