
export class clientUtility {
    findedId: number = 0;
    constructor() {

    }
    SearchIdProcess( root, tree, name ) {

        tree.push( {
            id: root.id,
            name: root.name

        } );

        if ( root.name === name ) {
            this.findedId = root.id;
            // console.log(this.findedId);
        }

        if ( root.hasOwnProperty( "children" ) && root.children instanceof Array ) {
            root.children.forEach( child => {
                this.SearchIdProcess( child, tree, name );
            } );

        }

    }

    getValueId( arr: any[], name, numval ): number {

        arr.forEach( item => {
            this.SearchIdProcess( item, [], name );
        } );
        numval = this.findedId;
        return numval;
    }
}