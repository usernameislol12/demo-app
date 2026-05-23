pipeline{
  agent any
  tools{
    maven 'Maven'
    jdk 'JDK17'
  }
  stages{
    stage('chechout'){
      steps{
        git branch: 'main',
            url: 'https://github.com/usernameislol12/demo-app.git',
            credentialsId: 'credential'
    }
    }
    stage('build'){
      steps{
        sh 'mvn clean compile'
      }
    }
    stage('test'){
      steps{
        sh 'mvn test'
      }
    }
    stage('package'){
      steps{
        sh 'mvn package'
      }
    }
    stage('application'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass="com.example.app.App"'
      }
    }
  }
  post{
    success{
      emailext(
        subject: "success : ${JOB_NAME} #${BUILD_NUMBER}",
        body: "successfully completed:\ncheck ${BUILD_URL}",
        to:"usernameislol25@gmail.com"
        )
    }
    failure{
      emailext(
        subject: "failure : ${JOB_NAME} #${BUILD_NUMBER}",
        body: " build failed:\ncheck ${BUILD_URL}",
        to:"usernameislol25@gmail.com"
        )
    }
  }
}
    
    
