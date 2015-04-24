package com.demo

import grails.validation.Validateable

class TestController implements TestControllerTrait {

	static allowedMethods = [
			show          : 'GET',
	]

	/**
	 * Retrieve the current user's data
	 *
	 * @return
	 */
	def show() {
		String id = loggedUserId
	}

}

