
//Evomatik Object
function Evomatik(config){
	console.group();
	console.log( "%cEvomatik"+" "+"Software.", 'background:#286880; color:yellow; font-size: 16pt; fontWeight:bold; fontFamily:"Open Sans";' );
	console.log("%cTodos los Derechos Reservados Evomatik Software 2015.", 'color:#286880; font-size: 12pt; fontFamily:"Open Sans";')

	this.entorno =  config.environment || "Debug";
	this.console = new Console(this.entorno);
	this.alert = new Alert();
	this.request = new Request(this.entorno);
}

Evomatik.prototype.info = function(){
	this.console.info("Departamento de desarrollo, Veracruz!");
}

Evomatik.prototype.version = function(){
	this.console.info("Version: 0.105");
	console.groupEnd();
}

function Console(environment){
	this.environment = environment || "Debug";
}

Console.prototype = {
	log: function(mensaje){
		if(this.environment == "Debug"){
			console.log(mensaje);
		}	
	},
	info: function(mensaje){
		if(this.environment == "Debug"){
			console.info(mensaje);
		}	
	},
	error: function(mensaje){
		if(this.environment == "Debug"){
			console.error(mensaje);
		}	
	},
} 

function Request(environment){
	this.environment = environment || "Debug";
}

Request.prototype = {
	ajax: function(url, type, data){
		var request = $.ajax({
			url: url,
			type: type,
			data: data,
		});
		return request;
	}
}


function Alert(){
	this.message = 'Error';
	this.leyend = 'Algo Salio mal';
}

Alert.prototype = {
	done:function(message, leyend){
		if(message && leyend){
			this.message = message;
			this.leyend = leyend;
			swal(this.message, this.leyend, "success");
		}else{
			this.message = message || this.message;
			this.leyend = leyend || this.leyend;
			swal(this.message, this.leyend, "error");
		}
		
	},
	error:function(message, leyend){
		this.message = message || this.message;
		this.leyend = leyend || this.leyend;
		swal(this.message, this.leyend, "error");
	}
}

var Evomatik = new Evomatik(config);

Evomatik.info();
Evomatik.version();


function fillSelect(id, fill, field){
	Evomatik.console.log('idElement: '+id+' Fill: '+fill+' Field: '+field);
	var option = "";
	$.when(
		$.ajax({
			url: fill,
			type: 'GET',
			dataType: "json",
			async:true
		})	
	).done(function(data) {
		Evomatik.console.log('data to select: ');
		$("#"+id).html("");
		$("#"+id).append('<option value="0" disabled="disabled" selected>Seleccione una opci&oacute;n</option>');
		if(!$.isEmptyObject(data)){
			jQuery.each(data, function(i, val) {
				Evomatik.console.log(val);
				option+='<option value="'+val.id+'">'+val[field]+'</option>';
			
			});
		} 
		$("#"+id).append(option);
	});
}

function fillSelectEdit(idElement, fill, field, id){
	Evomatik.console.log('idElement: '+idElement+' Fill: '+fill+' Field: '+field+' id: '+id);
	var option = "";
	$.when(
		$.ajax({
			url: fill,
			type: 'GET',
			dataType: "json",
			async:true
		})	
	).done(function(data) {
		Evomatik.console.log('data to select: ');
		$("#"+idElement+"[data-edit='true']").html("");
		$("#"+idElement+"[data-edit='true']").append('<option value="0" disabled="disabled">Seleccione una opci&oacute;n</option>');
		if(!$.isEmptyObject(data)){
			jQuery.each(data, function(i, val) {
				Evomatik.console.log(val);
				if(val.id == id){
					option+='<option value="'+val.id+'" selected>'+val[field]+'</option>';
				}else{ 
					option+='<option value="'+val.id+'">'+val[field]+'</option>';
				}
			});
		} 
		$("#"+idElement+"[data-edit='true']").append(option);
	});
}



function fillSelectElement(element, fill, field){
	Evomatik.console.log('Element: '+element+' Fill: '+fill+' Field: '+field);
	var option = "";
	$.when(
		$.ajax({
			url: fill,
			type: 'GET',
			dataType: "json",
			async:true
		})	
	).done(function(data) {
		Evomatik.console.log('data to select: ');
		element.html("");
		element.append('<option value="0" disabled="disabled" selected>Seleccione una opci&oacute;n</option>');
		if(!$.isEmptyObject(data)){
			jQuery.each(data, function(i, val) {
				Evomatik.console.log(val);
				option+='<option value="'+val.id+'">'+val[field]+'</option>';
			
			});
		} 
		element.append(option);
	});
}

function fillSelectElementEdit(element, fill, field, id){
	Evomatik.console.log('Element: '+element+' Fill: '+fill+' Field: '+field+' id: '+id);
	var option = "";
	$.when(
		$.ajax({
			url: fill,
			type: 'GET',
			dataType: "json",
			async:true
		})	
	).done(function(data) {
		Evomatik.console.log('data to select: ');
		element.html("");
		element.append('<option value="0" disabled="disabled">Seleccione una opci&oacute;n</option>');
		if(!$.isEmptyObject(data)){
			jQuery.each(data, function(i, val) {
				Evomatik.console.log(val);
				if(val.id == id){
					option+='<option value="'+val.id+'" selected>'+val[field]+'</option>';
				}else{ 
					option+='<option value="'+val.id+'">'+val[field]+'</option>';
				}
			});
		} 
		element.append(option);
	});
}




function cargaLista(url, elementid){
	$.ajax({
		url: url,
		dataType: "json",
		success: function(data) {
			if(!$.isEmptyObject(data)){
				var name, select, option;
				for (name in data) {
					if (data.hasOwnProperty(name)) {
						var option = $('<option/>');
						option.attr({ 'value': name }).text(data[name]);
						$('#'+elementid).append(option);
					}
				}
			} 
		}
	});
}

function cargaListaEdit(url, elementid, value){
	var element = $("#"+elementid+"[data-edit='true']");
	element.html("");
	$.ajax({
		url: url,
		dataType: "json",
		success: function(data) {
			if(!$.isEmptyObject(data)){
				var name, select, option;
				for (name in data) {
					if (data.hasOwnProperty(name)) {
						if(value == name){
							var option = $('<option selected/>');
							option.attr({ 'value': name }).text(data[name]);
							element.append(option);
					    } else {
					    	var option = $('<option/>');
							option.attr({ 'value': name }).text(data[name]);
							element.append(option);	
					    }
					}
				}
			} 
		}
	});
}


function loadValidation(form,arrayValidation){
	Evomatik.console.log('Form:');
	Evomatik.console.info(form);
	Evomatik.console.log('Array:');
	Evomatik.console.info(arrayValidation);
	form.validation({
      required: arrayValidation
    });
	Evomatik.console.log('Load Validation Gumby!')
}


function showHideRadio(idElement, ElementToShowHide, ArrayClean){
  $(function() {
     $(document).on('click', 'label[for="'+idElement+'"]', function(event) {
        event.preventDefault();
        Evomatik.console.log('Cambio');
        Evomatik.console.log($(this).children("input[type='radio']").val());
        if($(this).children("input[type='radio']").val() == 'true') {
          Evomatik.console.log("Check");
           $('#'+ElementToShowHide).slideDown(400);
        }
        if($(this).children("input[type='radio']").val() == 'false') {
          Evomatik.console.log("uncheck");
          $('#'+ElementToShowHide).slideUp(400);
          $.each(ArrayClean, function(index, val) {
            validateInput(index, val)
          });
        }
      });
  });
}


function showHideCheckbox(idElement, ElementToShowHide, ArrayClean){
  $(function() {
     $(document).on('click', 'label[for="'+idElement+'"], i.icon-check', function(event) {
        event.preventDefault();
        Evomatik.console.log('Cambio');
        if($(this).hasClass('checked') || $(this).parents('label').hasClass('checked')) {
          Evomatik.console.log("Check");
           $('#'+ElementToShowHide).slideDown(400);
        }else{
            Evomatik.console.log("uncheck");
            $('#'+ElementToShowHide).slideUp(400);
            $.each(ArrayClean, function(index, val) {
                validateInput(index, val);
            });
        }
      });
  });
}



function validateInput(index, val){
    Evomatik.console.log($('#'+val).attr("type"));
    if($('#'+val).attr("type") == "radio") {
      $('#'+val).each(function(index, el) {
        Evomatik.console.log('Vuelta');
        $(el).attr('checked', false);
        $(el).next().empty();
        $(el).parents("label").removeClass('checked');
      });
    }else if($('#'+val).attr("type") == "checkbox"){
        $('#'+val).attr('checked', false);
        $('#'+val).next().empty();
        $('#'+val).parents("label").removeClass('checked');
    }else{
      if ($('#'+val).attr("data-type") == "tokeninput") {
         $('#'+val).tokenInput("clear");
      }else{
      Evomatik.console.log('Diferente a Radios'); 
      Evomatik.console.log('Campo a limpiar #'+val);   
      $('#'+val).val('');
      }
    }
}










