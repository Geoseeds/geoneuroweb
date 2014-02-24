class BootStrap {

    def init = { servletContext ->
		// Check whether the test data already exists.
		//if (!Tree.count()) {
		//	new Tree(author: "Stephen King", title: "The Shining").save(failOnError: true)
		//}
    }
    def destroy = {
    }
}
