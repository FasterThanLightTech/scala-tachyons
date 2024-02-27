package com.ftlt.tachyon.di.bootstrap

import com.ftlt.tachyon.di.domain.Person

object MainApp:

  @main def main =
    val registry = new RegistryDefault {}
    registry.personService.save(Person("name", "age", "location"))
