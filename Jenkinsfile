pipeline {
  agent any
  environment {
    PATH = "${env.PATH};C:\\Windows\\System32" // Update the PATH to include the directory of cmd.exe
    GIT_CREDENTIALS = credentials('GithubSecret')
  }
  
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', credentialsId: 'GithubSecret', url: 'https://github.com/dungdpham/FarToCel.git'
      }
    }
    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }
    stage('Test') {
      steps{
        bat 'mvn test'
      }
      post {
        success {
          // Publish JUnit test results
          junit '**/target/surefire-reports/TEST-*.xml'
          // Generate JaCoCo code coverage report
          jacoco(execPattern: '**/target/jacoco.exec')
        }
      }
    }
  }
}
