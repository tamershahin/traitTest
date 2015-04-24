package com.demo

import grails.transaction.Transactional

@Transactional(readOnly = true)
trait TestControllerTrait {

	String getLoggedUserId() {
		//NPE caught by exceptionHandler()
		"userID"
	}

}