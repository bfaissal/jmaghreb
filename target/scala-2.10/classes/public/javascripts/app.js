/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-05-20
 * Time: 08:13
 * To change this template use File | Settings | File Templates.
 */
function mainController($scope){
    $scope.selectedPage = 0;
    $scope.isSelectedPage = function(index){
        if($scope.selectedPage == index){
            return true;
        }
        else{
            return false;
        }
    }
    $scope.goToPage = function(index){
        $scope.selectedPage = index;
        //alert(PageTransitions)
        nextPage(23,index);
    }
}

function homeController($scope){

}

function speakersController($scope){

}