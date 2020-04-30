function updatePicture() {

	var imageUrl = $("#picture").val();

	if (imageUrl != "") {

		var jsonRequest = {
			idPortfolio: 2001,
			imageUrl: imageUrl		
		};
		var jsonParsed = JSON.stringify(jsonRequest);
		var output = 0;
		$
				.ajax({
					type : 'post',
					contentType : "application/json; charset=utf-8",
					DataType : 'json',
					url : '/api/administration/updateData',
					data : jsonParsed,
					beforeSend : function() {
						Swal.fire({
							  imageUrl: '../images/loading.gif',
							  title: 'Updating...',
							  imageWidth: 180,
							  imageHeight: 180,
							  animation: false,
							  showConfirmButton: false,
							  allowOutsideClick: false
							})
					},
					success : function(response) {
						console.log(response);
						output = response;
					},
					complete : function() {
						if (output == 1) {
							$("#picture").val("");
							loadModalSwal("success", "update successful.");							
						} else if (output == 0) {
							loadModalSwal("error", "A problem occurred updating the data. The service may not be available. If the problem persists, contact your system administrator.");
						} else if (response == 2) {
							output("error", "Error updating data. Please contact the system administrator.");
						}
					}
				});

	} else {
		loadModalSwal("info", "Input is empty");
	}
}

function updateData() {
	
	var title = $("#title").val();
	var description = $("#description").val();

	if (title != "" && description != "") {

		var jsonRequest = {
			idPortfolio: 2001,
			title : title,
			description : description			
		};
		var jsonParsed = JSON.stringify(jsonRequest);
		var output = 0;
		$
				.ajax({
					type : 'post',
					contentType : "application/json; charset=utf-8",
					DataType : 'json',
					url : '/api/administration/updateData',
					data : jsonParsed,
					beforeSend : function() {
						Swal.fire({
							  imageUrl: '../images/loading.gif',
							  title: 'Updating...',
							  imageWidth: 180,
							  imageHeight: 180,
							  animation: false,
							  showConfirmButton: false,
							  allowOutsideClick: false
							})
					},
					success : function(response) {
						console.log(response);
						output = response;
					},
					complete : function() {
						if (output == 1) {
							$("#title").val("");
							$("#description").val("");
							loadModalSwal("success", "update successful.");
						} else if (output == 0) {
							loadModalSwal("error", "A problem occurred updating the data. The service may not be available. If the problem persists, contact your system administrator.");
						} else if (response == 2) {
							output("error", "Error updating data. Please contact the system administrator.");
						}
					}
				});

	} else {
		loadModalSwal("info", "All fields are required");
	}
}

function loadModalSwal(type, mensaje) {
	Swal.fire({
		  type: type,
		  text: mensaje,
		  width: '300px',
		  showCloseButton: true,
		  timer: 10000
		});	
}
