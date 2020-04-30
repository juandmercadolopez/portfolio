$(document).ready(function() {
	cargarTweets();
});

function cargarTweets() {
	$.ajax({
		type : 'get',
		contentType : "application/json; charset=utf-8",
		DataType : 'json',
		url : '/api/twitter/getTweets',
		beforeSend : function() {
			Swal.fire({
				  imageUrl: '../images/loading.gif',
				  title: 'Cargando tweets...',
				  imageWidth: 180,
				  imageHeight: 180,
				  animation: false,
				  showConfirmButton: false,
				  allowOutsideClick: false
				})
		},
		success : function(response) {
			if (response != undefined) {
				var json = JSON.parse(response);
				var tweets ="";
				for (var i = 0; i < json.length; i++) {
					tweets += "<p><strong>Date: </strong> " + json[i]['created_at'] + "</p><p>" + json[i]['text'] + "</p>";
				}
				document.getElementById("tweets-info").innerHTML = tweets;
			}
		},
		complete : function() {
			Swal.close();
		}
	});
}