function deletePerson(personId){
	$.get("/rest-angular/person/delete/"+personId,function(data){
		alert("accion realizada correctamente");
	});
}