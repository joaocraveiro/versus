app.controller('mainCtrl', ['$scope', '$http', function ($scope, $http) {


    // login
    $scope.login = function(){
        $http.get('/login').success(function(data){
            window.location = "/index2";
        }).error(function(data){
            console.log('error:' + data);
            window.location = "/";
        });
    };

    // logout
    $scope.logout = function(){            
        $http.get('/logout').success(function(data){      
            window.location = "/";
        }).error(function(data){
            console.log('error:' + data);
        });
    };


    
}]);    