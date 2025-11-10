// this is first pipeline
pipeline {
    agent any
    stages {
        stage ('build-stage') {
            steps {
                echo "this is my first pipeline"
            }
        }
    }
}