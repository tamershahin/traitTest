grails.servlet.version = '3.0' // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'
grails.project.work.dir = 'target/work'
grails.project.target.level = 1.7
grails.project.source.level = 1.7


grails.project.war.file = "target/${appName}-${grails.util.Environment.current.name}-${appVersion}.war"
grails.war.resources = { stagingDir ->
	delete { fileset(dir: "${stagingDir}", includes: '**/.gitignore') }
}

//uncomment (and adjust settings) to fork the JVM to isolate classpaths
grails.project.fork = [
		run: [maxMemory:1024, minMemory:64, debug:false, maxPerm:256]
]

grails.project.dependency.resolver = 'maven'

grails.project.dependency.resolution = {
	// inherit Grails' default dependencies
	inherits('global') {
		// specify dependency exclusions here; for example, uncomment this to disable ehcache:
		// excludes 'ehcache'
	}
	log 'error' // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	checksums true // Whether to verify checksums on resolve
	legacyResolve false
	// whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

	repositories {
		inherits true // Whether to inherit repository definitions from plugins

		grailsPlugins()
		grailsHome()
		mavenLocal()
		grailsCentral()
		mavenCentral()
		mavenRepo 'http://repo.spring.io/milestone' // for spring cloud
	}

	dependencies {
		// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.
	}

	plugins {
		// plugins for the build system only
		build ':tomcat:7.0.55.2'

	}
}
