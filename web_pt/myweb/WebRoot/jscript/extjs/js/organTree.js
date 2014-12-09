Ext.onReady(function(){

    var tree = new Ext.tree.TreePanel({
        el: 'tree',
        autoScroll : true,
        rootVisible:false,
        loader: new Ext.tree.TreeLoader({dataUrl: '/org/getTreeNode.action'})
    });
    var root = new Ext.tree.AsyncTreeNode({
        id: '1',
        text:'root'
    });

    tree.setRootNode(root);
    tree.on('click', function(node){/*if(node.leaf)*/alert(node.id);});
    tree.render();

    root.expand(false, false);
});