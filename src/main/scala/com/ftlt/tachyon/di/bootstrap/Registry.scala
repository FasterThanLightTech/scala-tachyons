package com.ftlt.tachyon.di.bootstrap

import com.ftlt.tachyon.di.clients.PersonRestClient
import com.ftlt.tachyon.di.dao.PersonDao
import com.ftlt.tachyon.di.services.PersonService

trait Registry:

  lazy val personRestClient: PersonRestClient
  lazy val personDao: PersonDao
  lazy val personService: PersonService
