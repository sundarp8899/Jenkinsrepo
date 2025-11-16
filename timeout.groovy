pipeline {
    agent {
        label 'slave-java'
    }
    stages {
        stage ('build stage') {
            steps {
                timeout (time: 5, unit: 'SECONDS') {
                    echo "this is form time block"
                    sleep 60
                }
            }
        }
    }
}