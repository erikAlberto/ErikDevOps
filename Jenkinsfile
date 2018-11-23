pipeline{
  agent any

  stages{
    stage('Build quickstart'){
      steps{
        echo 'Building'
        sh './quickstart/gradlew clean assemble -p quickstart'
      }
    }
    stage('Testing quickstart'){
      steps{
        echo 'Runnig unit test'
        sh './quickstart/gradlew test -p quickstart'
        junit '**/test-results/test/*.xml'
      }
    }
    stage('Publish quickstart'){
      steps{
        echo 'Publishing Artifact'
        sh './gradlew uploadArchives'
        archiveArtifacts artifacts: '**/repos/*.jar'
      }
    }
    stage('Build web application'){
      steps{
        echo 'Building'
        sh './webapplication/gradlew clean assemble -p webapplication'
        sh './gradlew uploadArchives'
        archiveArtifacts artifacts: '**/repos/*.war'
      }
    }
    stage('Testing web application'){
      steps{
        echo 'Runnig unit test'
        sh './webapplication/gradlew test -p webapplication'
        junit '**/test-results/test/*.xml'
        archiveArtifacts artifacts: '**/reports/tests/test/*.html'
      }
    }
    stage('Security web application'){
      steps{
        echo 'Security'
        sh './webapplication/gradlew sonarqube'
        sh './webapplication/gradlew dependencyCheckAnalyze -p webapplication'
        archiveArtifacts artifacts: '**/reports/*.html
      }
    }
    stage('Deploy web application'){
      steps{
        echo 'Deployment'
        sh './webapplication/gradlew -b deploy.gradle copyWar -p webapplication'
      }
    }
  }
}
