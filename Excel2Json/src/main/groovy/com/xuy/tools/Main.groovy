package com.xuy.tools

import com.buck.util.convert.xls2json.Xls2json;

class Main {

	def static main(args){
		
		def xlsPath = './xls/'
		def jsonPath = './json/'
		println '_______________start__________________'
		Xls2json.main(xlsPath, jsonPath)
		println '_______________end__________________'
	}
}
