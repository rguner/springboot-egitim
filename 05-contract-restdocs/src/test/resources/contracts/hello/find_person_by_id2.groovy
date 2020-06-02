import org.springframework.cloud.contract.spec.Contract

Contract.make {
	description "Spring training API contract for find person by id"
	
	request {
		url "/person/2"
		method GET()
	}
	
	response {
		status 200
		
		headers {
			contentType applicationJson()
		}
		
		body (
			id: 2,
			name: "hebele",
			surname: "hübele"
		)
	}
}