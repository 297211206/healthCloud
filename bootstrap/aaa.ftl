<div class="loveProjectList" >
			        <div>
			        <ul class="love-project-list clearfix" id="lProjectListId">
				        <#list LoveProjectModelList as model>
					            <a href="loveProject.action?lvProjectId=${model.lvProjectId}">
					            	<li id="${model.lvProjectId}" class="lvprojectli">
					            		<img src="${model.project.picUrl}">
					            		<p class="p-name">(第${model.period}矿)${model.goods.name}</p>
					            		<ins class="gray9">价值:￥${model.price}</ins>

						            	<div class="Progress-bar">
						            		<p class="u-progress">
						           				<span style="width:${model.saleNum/model.totalNum*100}%;" class="pgbar">
						           					<span class="pging"></span>
						           				</span>
						           			</p>
						           		</div>
						           		<div class="btn-wrap" codeid="${model.id}">
						            			<a href="javascript:;" class="buy-btn">立即1元挖矿</a>
						            			<div class="gRate">
						            				<a href="javascript:;" class="add"><s id="goodscar"></s></a>
						            			</div>
						            	</div>
					            	</li>
					            </a>
				           </#list>
			           </ul>
			           </div>
			      	<div id="divGoodsLoading" class="loading" style="display: none;"><b></b>正在加载</div>
			            <a id="btnLoadMore" class="loading" href="javascript:;" style="<#if count <=ygPeriodModelList.size() >display:none<#else>display:block</#if>">点击加载更多</a>
			            <input type="hidden" id="loadNum" value="1">
			             <input type="hidden" id="count" value="${count}">
			            <input type="hidden" id="jiazhi" <#if goodType =="jiazhimin">value="0"<#else>value="1"</#if>>
			        </div>