def loadConfig() {
    new ConfigSlurper().parse(new File(WORKSPACE + "/env.txt").toURI().toURL());

}


return this;

