var app = (function(){
    var _name;

    var _tabla = function(aiports){
        map.plotMarkers(aiports)<
        $("#datos > tbody").empty();
        aiports.map(function(airport){
            $("#datos > tbody").append(
                "<tr>"+
                "<td>"+airport.airportId + "</td>" +
                "<td>"+ airport.name+ "</td>" +
                "<td>"+ airport.city+ "</td>" +
                "<td>"+ airport.countryCode+ "</td>" +
                "</tr>"
            );
        });

    };

    var searchAirportsByName = function(){
        _name = $("#name").val();
        console.log(_name);
        apiclient.searchAirportsByName(_name,_tabla)
    };

    return{
        searchAirportsByName:searchAirportsByName

    };
})();