/**
 * 
 */
$(function() {

	var reihenfolge = 1;
  $(".sortieren").on("click",function(){
			
      reihenfolge *= -1;

			
      $(".meineTabelle tr").sort(sort_tr).appendTo('.meineTabelle');

        function sort_tr(a, b) {
          return ($(b).data('platzierung')) < ($(a).data('platzierung')) ? reihenfolge : -1*reihenfolge;
        }
  })


});