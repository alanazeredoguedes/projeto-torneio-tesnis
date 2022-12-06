pipeline {
    agent { docker { image 'maven:3.8.6-openjdk-11-slim' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn --version'
            }
        }
    }
}

pipeline {
    agent { docker { image 'maven:3.8.6-openjdk-11-slim' } }
    stages {
        stage('Build') {
            steps {
                mvn --version,
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/alanazeredoguedes/projeto-torneio-tesnis.git'
                sh './mvnw clean compile'
                // bat '.\\mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
                // bat '.\\mvnw test'
            }
        }
    }
}


pipeline {
  // This pipeline requires the following plugins:
  // * Git: https://plugins.jenkins.io/git/
  // * Workflow Aggregator: https://plugins.jenkins.io/workflow-aggregator/
  // * JUnit: https://plugins.jenkins.io/junit/
  agent 'any'
  stages {
    stage('Checkout') {
      steps {
        script {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/alanazeredoguedes/projeto-torneio-tesnis.git']]])
        }
      }
    }
    stage('Test') {
      steps {
        sh(script: './mvnw test')

      }
    }
  }

}