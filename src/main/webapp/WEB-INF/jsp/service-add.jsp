<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="商品详情" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">服务器名称：</td>
                <td>
                    <input class="easyui-textbox" type="hidden" id="id" name="id">
                    <input class="easyui-textbox" type="text" id="serverName" name="serverName"
                           data-options="required:true" style="width:75%">
                </td>
            </tr>
            <tr>
                <td class="label">服务器ip：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="ip" name="ip"
                           data-options="required:true" style="width:75%">
                </td>
            </tr>
            <tr>
                <td class="label">用户名：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="userName" name="userName"
                           data-options="required:true" style="width:75%">
                </td>
            </tr>
            <tr>
                <td class="label">密码：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="passWord" name="passWord"
                           data-options="required:true" style="width:75%">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">

    //初始化商品类目树
   /* $('#cid').combotree({
        url: 'itemCats?id=0',
        required: true,
        //在节点展开之前触发，返回false可以取消展开操作
        onBeforeExpand: function (node) {
            //获取当前被点击的tree
            //变量命名法：如果是普通的DOM对象的话使用变量即可 var tree
            //如果是JQUERY对象的话，定义变量名的时候就可以在前面加上$,如var $tree
            var $currentTree = $('#cid').combotree('tree');
            //调用easyui tree组件的options方法
            var option = $currentTree.tree('options');
            //修改option的url属性
            option.url = 'itemCats?id=' + node.id;
        },
        //在用户选择一个节点之前触发，返回false可以取消选择动作
        onBeforeSelect: function (node) {
            var isLeaf = $('#cid').tree('isLeaf', node.target);
            if (!isLeaf) {
                $.messager.alert('警告', '请选择最终类目', 'warning');
                return false;
            } else {
                //动态生成对应最终类目的参数规格信息，并且追加到页面上
                $.get('itemParam/query/' + node.id, function (data) {
                    var $outerTd = $('#itemAddForm .paramsShow td').eq(1);
                    var $ul = $('<ul>');
                    $outerTd.empty().append($ul);
                    if (data) {
                        var paramData = data.paramData;
                        paramData = JSON.parse(paramData);
                        //遍历分组
                        $.each(paramData, function (i, e) {
                            var groupName = e.group;
                            var $li = $('<li>');
                            var $table = $('<table>');
                            var $tr = $('<tr>');
                            var $td = $('<td colspan="2" class="group">' + groupName + '</td>');

                            $ul.append($li);
                            $li.append($table);
                            $table.append($tr);
                            $tr.append($td);

                            //遍历分组项
                            if (e.params) {
                                $.each(e.params, function (_i, paramName) {
                                    var _$tr = $('<tr><td class="param">' + paramName + '</td><td><input></td></tr>');
                                    $table.append(_$tr);
                                });
                            }
                        });

                        $("#itemAddForm .paramsShow").show();
                    } else {

                        $("#itemAddForm .paramsShow").hide();
                        $("#itemAddForm .paramsShow td").eq(1).empty();//第二个td
                    }
                });

            }
        }
    });*/
    //提交表单
    function submitForm() {
        $('#itemAddForm').form('submit', {
            //提交表单动作的URL地址
            url: 'serviceAdd',
            //在提交之前触发，返回false可以终止提交
            onSubmit: function () {
                debugger;
                $('#price').val($('#priceView').val() * 100);

                //获取参数规格部分
                var paramsJson = [];
                var $liList = $('#itemAddForm .paramsShow li');
                $liList.each(function (i, e) {
                    $group = $(e).find('.group');
                    var groupName = $group.text();

                    var params = [];
                    var $trParams = $(e).find('tr').has('td.param');
                    $trParams.each(function (_i, _e) {
                        var $oneDataTr = $(_e);
                        var $keyTd = $oneDataTr.find('.param');
                        var $valueInput = $keyTd.next('td').find('input');
                        var key = $keyTd.text();
                        var value = $valueInput.val();

                        var _o = {
                            k: key,
                            v: value
                        };
                        params.push(_o);
                    });
                    var o = {};
                    o.group = groupName;
                    o.params = params;
                    paramsJson.push(o);
                });
                paramsJson = JSON.stringify(paramsJson);
                $('#paramData').val(paramsJson);

                return $(this).form('validate');
            },
            //在表单提交成功以后触发
            success: function (data) {
                debugger;
                if(data == 'succeed'){
                    babysbreath.closeTab('新增服务器');
                    $.messager.alert('消息', '添加成功！');
                    babysbreath.addTab('查询服务器及文件所在位置情况', 'item-list');
                }else {
                    $.messager.alert('消息', '添加失败，请重新尝试！');
                }
            }
        });
    }
    //表单的重置功能
    function clearForm() {
        $('#itemAddForm').form('reset');
    }
</script>