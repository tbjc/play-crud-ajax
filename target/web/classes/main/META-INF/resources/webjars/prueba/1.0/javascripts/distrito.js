console.log('Modulo de Distritos');
$(function() {
   var arrayJsonObject;
   var varRecords;
   var uri = "/distrito";
   var defaultTemplate = _.template($("#object-Template").html());
   var contentTemplate;
   Evomatik.console.log("Distritos");
   $.ajax({
         url: uri+"/list",
         type: 'GET',
         dataType: 'json',
         // contentType: 'application/json',
         // data: '{"descripcion":"Cambiado descripcion"}',
      })
      .done(function(data) {
         Evomatik.console.log("DATA: "+data);
         Evomatik.console.log(data);
         Evomatik.console.log("success");
         arrayJsonObject = data;
         var varRecords = {records:[]};
         varRecords.records.push(arrayJsonObject);
         Evomatik.console.log(varRecords);
         //varRecords = JSON.parse(change);
         contentTemplate = defaultTemplate({Objects : arrayJsonObject});
         $(".construct-content").html(contentTemplate);
         $('.contentTable').DataTable();
      })
      .fail(function() {
         Evomatik.console.log("error");
      })
      .always(function() {
         Evomatik.console.log("complete");
      });


   $("body").on('click', '#editActionbtn', function(event) {
         event.preventDefault();
         var id = $(this).attr('data-id');
         $.ajax({
            url: uri+'/show/'+id,
            type: 'GET',
            dataType: 'json',
            async: false,
            //data: {param1: 'value1'},
         })
         .done(function(data) {
            Evomatik.console.log("success");
            Evomatik.console.log("DATA: "+data);
            $("#distrito[data-edit='true']").val(data.distrito);
            $("input[id='id']").val(data.id);
            $("#editModal").addClass('active');

         })
         .fail(function() {
            Evomatik.console.log("error");
            alert("error al cargar la informacion del registro, Intentalo nuevamente.");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });   
      });



      $(document).on('click', '.createAction', function(event) {
         event.preventDefault();
         var form = $(this).parents('form:first');
         var modal = $(this).parents('div.modal');
         var data = form.toJsonObject();
         $.ajax({
            url: uri,
            type: 'POST',
            contentType: 'application/json',
            data: data,
         })
         .done(function(data) {
            Evomatik.console.log("success");
            Evomatik.console.log(data);
            Evomatik.contentTemplate = defaultTemplate({Objects : arrayJsonObject});
            $(".construct-content").html(contentTemplate);
            modal.removeClass('active');
            var t = $('.contentTable').DataTable();
            var rowNode = t.row.add([
                  '<span id="_'+data.id+'">'+data.id+'</span>',
                  '<span id="dis_'+data.id+'">'+data.distrito+'</span>',
                  '<div class="medium warning btn icon-right icon-pencil"><a href="#" id="editActionbtn" data-id='+data.id+'>Editar</a></div> <div class="medium danger btn icon-right icon-cancel-circled"><a href="#" id="deleteAction" data-id='+data.id+'> Eliminar</a></div>',
               ]).draw().node();

            var prevNode = $(rowNode).prev();
            if(prevNode.hasClass('odd')){
               $(rowNode).attr('class', "object even");
            }else{
                $(rowNode).attr('class', "object odd");
            }
            $(rowNode).attr('data-row', "_"+data.id);
            $(rowNode).attr('role', "row");

         })
         .fail(function() {
            Evomatik.console.log("error");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });
      });   

      $(document).on('click', '.editAction', function(event) {
         event.preventDefault();
         var id = $("input[id='id']").val();
         var form = $(this).parents('form:first');
         var modal = $(this).parents('div.modal');
         var data = form.toJsonObject();
         Evomatik.console.log(form.serialize());
         Evomatik.console.log(data);
         $.ajax({
            url: uri+'/'+id,
            type: 'PUT',
            contentType: 'application/json',
            data: data,
            // data: data2,
         })
         .done(function(data) {
            Evomatik.console.log("success");
            Evomatik.console.log(data);
            $("#dis_"+data.id).text(data.distrito);
            form.resetear();
            modal.removeClass('active');
         })
         .fail(function() {
            Evomatik.console.log("error");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });
      }); 

   $(document).on('click', '#deleteAction', function(event) {
      event.preventDefault();
      var id = $(this).attr('data-id');
      $.ajax({
            url: uri+'/'+id,
            type: 'DELETE',
         })
         .done(function() {
            Evomatik.console.log("success deleted");
            var t = $('.contentTable').DataTable();
            t.row('.object[data-row="_'+id+'"]').remove().draw( false );   
         })
         .fail(function() {
            Evomatik.console.log("error");
         })
         .always(function() {
            Evomatik.console.log("complete");
         });
   });



      $(document).on('click', '.cancelAction', function(event) {
         event.preventDefault();
         /* Act on the event */
         var form = $(this).parents('form:first');
         var modal = $(this).parents('div.modal');
         form.resetear();
         $("input[id='id']").val("");
         modal.removeClass('active');
      }); 



});