apiclient= (function(){
    return {
        searchAirportsByName: function(name,callback) {
            var getPromise = jQuery.ajax({
              url: "/airports/by-text?text="+name,
              success: function(result) {
                callback(result);
              },
              async: true
            });
            getPromise.then(
              function() {
                console.info("OK ");
              },
              function() {
                alert("No se encuentra: " + name);
              }
            );
          }
    }
})();