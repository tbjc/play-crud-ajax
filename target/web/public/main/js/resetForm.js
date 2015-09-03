//Limpiar un Formulario
jQuery.fn.resetear = function () {
  $(this).each (function() { this.reset(); });
}


jQuery.fn.toJsonTrue = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
    	if (this.name != "id") {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    	}
    });
    return o;
};



//Convertir un objeto en un objeto e Json
jQuery.fn.toJsonObject = function()
{
    var o = "{";
    var a = this.serializeArray();
    var total = a.length;
    console.log(total);
    $.each(a, function(i) {
    	if (this.name != "id") {
    	 if (i === total - 1) {
        	// this is the last one
        	o+='"'+this.name+'":"'+this.value+'"';
   		 }else{
        	o+='"'+this.name+'":"'+this.value+'",';
   		 }
    	}
    });
    o+="}";
    return o;
};